package com.spring.mvc.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public final class JacksonUtil {  
	  
    public static ObjectMapper objectMapper;  
  
    /** 
     * ʹ�÷��ͷ�������json�ַ���ת��Ϊ��Ӧ��JavaBean���� 
     * (1)ת��Ϊ��ͨJavaBean��readValue(json,Student.class) 
     * (2)ת��ΪList,��List<Student>,���ڶ�����������ΪStudent 
     * [].class.Ȼ��ʹ��Arrays.asList();�����ѵõ�������ת��Ϊ�ض����͵�List 
     *  
     * @param jsonStr 
     * @param valueType 
     * @return 
     */  
    public static <T> T readValue(String jsonStr, Class<T> valueType) {  
        if (objectMapper == null) {  
            objectMapper = new ObjectMapper();  
        }  
  
        try {  
            return objectMapper.readValue(jsonStr, valueType);  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
  
        return null;  
    }  
      
    /** 
     * json����תList 
     * @param jsonStr 
     * @param valueTypeRef 
     * @return 
     */  
    public static <T> T readValue(String jsonStr, TypeReference<T> valueTypeRef){  
        if (objectMapper == null) {  
            objectMapper = new ObjectMapper();  
        }  
  
        try {  
            return objectMapper.readValue(jsonStr, valueTypeRef);  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
  
        return null;  
    }  
  
    /** 
     * ��JavaBeanת��Ϊjson�ַ��� 
     *  
     * @param object 
     * @return 
     */  
    public static String toJSon(Object object) {  
        if (objectMapper == null) {  
            objectMapper = new ObjectMapper();  
        }  
  
        try {  
            return objectMapper.writeValueAsString(object);  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
  
        return null;  
    }  
  
}