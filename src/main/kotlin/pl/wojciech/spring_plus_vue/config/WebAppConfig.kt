package pl.wojciech.spring_plus_vue.config

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class WebAppConfig : WebMvcConfigurer {

    override fun addViewControllers(registry: ViewControllerRegistry) {

    }
}
