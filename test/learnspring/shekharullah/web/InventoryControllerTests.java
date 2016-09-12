package learnspring.shekharullah.web;

import org.springframework.web.servlet.ModelAndView;
import junit.framework.TestCase;


public class InventoryControllerTests extends TestCase {

    public void testHandleRequestView() throws Exception{		
    	InventoryController controller = new InventoryController();
        ModelAndView modelAndView = controller.handleRequest(null, null);
        assertEquals("jsp/hello.jsp", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        String nowValue = (String) modelAndView.getModel().get("now");
        assertNotNull(nowValue);
    }
}