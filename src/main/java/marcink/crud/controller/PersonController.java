package marcink.crud.controller;

import marcink.crud.model.Person;
import marcink.crud.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Marcin on 2014-09-15.
 */

@Controller
public class PersonController {

    @Autowired
    private PersonService personService;


    @RequestMapping(value = {"/", "/personList"})
    public ModelAndView personList() {
        List personList = personService.personList();
        return new ModelAndView("personList", "personList", personList);
    }


    @RequestMapping(value = "/addPerson", method = RequestMethod.GET)
    public String add(Model model) {
        model.addAttribute("person", new Person());
        return "addPerson";

    }


    @RequestMapping(value = "/save", method = RequestMethod.POST)

    public String save(@Valid @ModelAttribute("person") Person person,
                       BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "addPerson";
        }
        if (null == person.getId()) {
            personService.addPerson(person);
        } else {
            personService.updatePerson(person);
        }
        return "redirect:personList";
    }


    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("person", personService.getPerson(id));
        return "addPerson";

    }


    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable Integer id) {
        personService.deletePerson(id);
        return "redirect:/";

    }


}
