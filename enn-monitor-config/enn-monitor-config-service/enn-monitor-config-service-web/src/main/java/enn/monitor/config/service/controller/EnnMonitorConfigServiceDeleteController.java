package enn.monitor.config.service.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import enn.monitor.config.EnnMonitorConfig;
import enn.monitor.config.service.client.EnnMonitorConfigServiceClient;
import enn.monitor.config.service.parameters.EnnMonitorConfigServiceDeleteResponse;

@Controller
@RequestMapping(value = "service/delete")
public class EnnMonitorConfigServiceDeleteController {

	private static EnnMonitorConfigServiceClient client = new EnnMonitorConfigServiceClient(
			EnnMonitorConfig.getHost(), EnnMonitorConfig.getPort());
	
	@RequestMapping(value = "/init")
    public ModelAndView init(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
        ModelAndView mav = new ModelAndView();
        mav.setViewName("service/EnnMonitorConfigServiceDelete");

        return mav;
    }
	
	@RequestMapping(value = "/delete")
    public ModelAndView insert(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String id = request.getParameter("id");
		
		EnnMonitorConfigServiceDeleteResponse rsp = null;
		
		ModelAndView mav = new ModelAndView();
		
		if (id != null && id.trim().equals("") == false) {
			rsp = client.deleteService(Long.parseLong(id));
			mav.addObject("response",  rsp.toString());
		}

        mav.setViewName("service/EnnMonitorConfigServiceDelete");

        return mav;
    }

}
