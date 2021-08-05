package practice.practicedemo.mailTest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import practice.practicedemo.springboot.mail.MailService;

import javax.annotation.Resource;
import javax.mail.MessagingException;

/**
 * @Author Simple
 * @Create 2021/6/28 16:30
 */
@SpringBootTest()
public class MailServiceTest {

    @Resource
    MailService mailService;

    @Test
    public void sendSimpleMail() {
        mailService.sendSimpleMail("2419316154@qq.com",
                "普通文本邮件",
                "普通文本邮件内容测试");
    }

    @Test
    public void sendHtmlMail() throws MessagingException {
        mailService.sendHtmlMail("1976047635@qq.com","一封html测试邮件","<body style=\"text-align: center;margin-left: auto;margin-right: auto;\">\n"
                + " <div id=\"welcome\" style=\"text-align: center;position: absolute;\" >\n"
                +"      <h3>\"一封html测试邮件\"</h3>\n"
                +"      <span>http://www.baidu.com</span>"
                + "     <div style=\"text-align: center; padding: 10px\"><a style=\"text-decoration: none;\" href=\"https://zimug.com\" target=\"_bank\" >"
                + "           <strong>我很用心，希望你有所收获</strong></a></div>\n"
                + " </div>\n" + "</body>");
    }

    @Test
    public void sendAttachmentsMailTest() throws MessagingException {
        String filePath = "C:\\Users\\A\\Desktop\\学习资料\\20180717104224284.jpg";
        mailService.sendAttachmentsMail("2419316154@qq.com",
                "这是一封带附件的邮件", "邮件中有附件，请注意查收！",
                filePath);
    }

    @Test
    public void sendResourceMail() throws MessagingException {
        String rscId = "simplemu";
        String content = "<html><body>这是有图片的邮件<br/><img src=\'cid:" + rscId + "\' ></body></html>";
        String imgPath = "C:\\Users\\A\\Desktop\\学习资料\\20180717104224284.jpg";
        mailService.sendResourceMail("2419316154@qq.com",
                "这邮件中含有图片",
                content,
                imgPath,
                rscId);

    }
}