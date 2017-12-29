package hfy.action.test;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@Controller
@RequestMapping(value="/test/")
public class TestClass {
	
	@RequestMapping("1.do")
	public String getPage1() {
		
		return "/test/test1";
		
	}
    @RequestMapping({"springUpload","1test.do"})
    public String  springUpload(HttpServletRequest request) throws IllegalStateException, IOException
    {
         long  startTime=System.currentTimeMillis();
         //����ǰ�����ĳ�ʼ����  CommonsMutipartResolver ���ಿ�ֽ�������
        CommonsMultipartResolver multipartResolver=new CommonsMultipartResolver(
                request.getSession().getServletContext());
        //���form���Ƿ���enctype="multipart/form-data"
        if(multipartResolver.isMultipart(request))
        {
            //��request��ɶಿ��request
            MultipartHttpServletRequest multiRequest=(MultipartHttpServletRequest)request;
           //��ȡmultiRequest �����е��ļ���
            Iterator iter=multiRequest.getFileNames();
             
            while(iter.hasNext())
            {
                //һ�α��������ļ�
                MultipartFile file=multiRequest.getFile(iter.next().toString());
                if(file!=null)
                {
                    String path="E:/springUpload"+file.getOriginalFilename();
                    //�ϴ�
                    file.transferTo(new File(path));
                }
                 
            }
           
        }
        long  endTime=System.currentTimeMillis();
        System.out.println("������������ʱ�䣺"+String.valueOf(endTime-startTime)+"ms");
        return "/success"; 
    }
}
