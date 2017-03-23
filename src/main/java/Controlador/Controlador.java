/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Mapeo.Persona;
import Modelo.PersonaDAO;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author jonathan
 */
@Controller 
public class Controlador {
    
    @Autowired
    PersonaDAO persona;
    
    @RequestMapping(value="/")
    public String inicio(){
        return "inicio";
    }
    
    @RequestMapping(value="/persona2", method = RequestMethod.POST)
    public ModelAndView persona2(ModelMap model,HttpServletRequest request){
        String corr = request.getParameter("nombre2");
        String cont = request.getParameter("nombre3");
        model.addAttribute("correo", corr);
        model.addAttribute("contrasena", cont);
        return new ModelAndView("persona",model);
    
    }
    
    
    
    @RequestMapping(value="/persona1", method = RequestMethod.GET)
    public ModelAndView persona1(ModelMap model,HttpServletRequest request){
        Persona person = new Persona();
        String p = request.getParameter("nombre1");
        String c = request.getParameter("carrera1");
        String e = request.getParameter("email1");
        String pas = request.getParameter("password1");
        model.addAttribute("nombre1", p);
        model.addAttribute("carrera1", c);
        model.addAttribute("email1", e);
        model.addAttribute("password1", pas);
        
        person.setNombre_persona(p);
        person.setE_mail(e);
        person.setPassword(pas);
        person.setNombre_carrera(c);
        persona.guardar(person);
        
        
        return new ModelAndView("registro_completo",model);
    
    }
    
    
    @RequestMapping(value="/registro1", method = RequestMethod.GET)
    public ModelAndView registro1(ModelMap model,HttpServletRequest request){
        return new ModelAndView("registro",model);
    
    }
    
    
}
