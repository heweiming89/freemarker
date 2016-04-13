package cn.heweiming.freemarker.demo;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import freemarker.template.Template;
import freemarker.template.TemplateException;

public class Demo01 {

	@Test
	public void demo01() throws IOException, TemplateException {
		Template template = new Template(null, new StringReader(
				"用户名:\t${user};\rURL:\t${url};\r姓名:\t${name}"), null);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("user", "曾阿牛");
		map.put("url", "www.cn.com");
		map.put("name", "张无忌");
		template.process(map, new OutputStreamWriter(System.out));
	}
}
