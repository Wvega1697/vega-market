package com.wvega.market.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class HolaMundoController {

    @GetMapping("/hola")
    public String saludar(){
        return "                       __\n" +
                "                     .'  '.\n" +
                "                 _.-'/  |  \\\n" +
                "    ,        _.-\"  ,|  /  0 `-.\n" +
                "    |\\    .-\"       `--\"\"-.__.'=====================-,\n" +
                "    \\ '-'`        .___.--._)=========================|\n" +
                "     \\            .'      |                          |\n" +
                "      |     /,_.-'        |        HOLA MUNDO        |\n" +
                "    _/   _.'(             |           EN             |\n" +
                "   /  ,-' \\  \\            |         SPRING           |\n" +
                "   \\  \\    `-'            |                          |\n" +
                "    `-'                   '--------------------------'";
    }

    @GetMapping("/adios")
    public String despedirse(){
        return "Adios Mundo de Spring!! 🍃";
    }
}
