package com.yucelen;

import org.springframework.web.bind.annotation.RestController;

/*
 * ComponentScan : Belirtilen package(lar) altındaki component classların taranaraktespit edilme işlemini 
 * yönetebilmemizi sağlayan bir anotasyondur.
 * 
 * basePackages : Taranacak packageları String listesi olarak belirterek bu packagelar altındaki component classların
 * taranıp tespit edilmesini sağlar. Package listesi belirtilmezse ComponentScan in yazıldığı package basePAckage olur.
 * 
 * basePackageClasses : bunla belirtilen classların bulunduğu packagelar basePackage olur.
 */

@RestController
public class MyController {

}
