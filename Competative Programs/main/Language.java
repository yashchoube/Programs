package main;

import java.util.*;

class LanguageStudent {
    List<String> langaugeList= new ArrayList<>();
   
    public List<String> getLanguages(){
        return langaugeList;
    }
    
    public void addLanguage(String language){
        langaugeList.add(language);
    }

}

class Language extends LanguageStudent {
    
	 boolean teach(LanguageStudent student,String language){
         
         List<String> list = getLanguages();
         if(list.contains(language)){
             return true;
         }
         return false;
	 }
         
    public static void main(String[] args) {
       
        
    Language teacher = new Language();
     teacher.addLanguage("English");

      LanguageStudent student1 = new LanguageStudent();
      System.out.println(teacher.teach(student1, "English"));

      for(String language : student1.getLanguages())
          System.out.println(language);
    }
	
}
