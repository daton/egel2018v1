package org.campitos.egel2018v1

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ControladorInicial{

    @GetMapping("/hola")
fun hola()="hola mundo malodd"




}