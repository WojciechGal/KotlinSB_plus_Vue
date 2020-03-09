package pl.wojciech.spring_plus_vue.home

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HomeController {

    @GetMapping("/home")
    fun home(model: Model): String {
        model.addAttribute("event", "Coronavirus")
        return "home"
    }
}
