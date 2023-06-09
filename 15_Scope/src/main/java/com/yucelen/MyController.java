package com.yucelen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

/*1)"singleton"(varsayılan) : her bir IoC container için sadece 1 nesne oluşturulur.
 *    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
 *    
 *2)"prototype" : her injection işleminde yeni 1 nesne oluşturulur.
 *    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)    
 *    
 *3)"request" : her HTTP requesti için yeni 1 nesne oluşturulur.
 *    @RequestScope
 * 
 *4)"session" : her HTTP sessionı için yeni 1 nesne oluşturulur.
 *    @SessionScope
 *    
 *5)"global-session" : her global HTTP sessionı için yeni 1 nesne oluşturulur. Portlet uygulamalar için kullanılır.
 * 
 *6)"application" : tüm uygulama içersinde sadece 1 tane oluşturulur.
 *
 *7)"websocket" : her websocket yaşam döngüsü için sadece 1 tane nesne oluşturulur.
 * 
 */

@RestController
@RequestMapping("/api")
public class MyController {

	@Autowired
	private MyComponent myComponent;
	
	@GetMapping("/mycont")
	public String getNameOfComponent() {
		return this.myComponent.getName();
	}

}
