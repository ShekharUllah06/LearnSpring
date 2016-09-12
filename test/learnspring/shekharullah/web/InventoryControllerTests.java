package learnspring.shekharullah.web;

import java.util.Map;

import org.springframework.web.servlet.ModelAndView;

import junit.framework.TestCase;
import learnspring.shekharullah.service.ProductManager;
import learnspring.shekharullah.service.SimpleProductManager;


public class InventoryControllerTests extends TestCase {

    public void testHandleRequestView() throws Exception{		
    	InventoryController controller = new InventoryController();
        controller.setProductManager((ProductManager)(new SimpleProductManager()));
        ModelAndView modelAndView = controller.handleRequest(null, null);
        assertEquals("hello", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        Map modelMap = (Map) modelAndView.getModel().get("model");
        String nowValue = (String) modelMap.get("now");
        assertNotNull(nowValue);
    }
}