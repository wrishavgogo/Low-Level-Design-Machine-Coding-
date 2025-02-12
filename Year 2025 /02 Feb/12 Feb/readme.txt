
Watching Lecture 8 of Keerti Purswani LLD Course 


Adapter Design Pattern :- ( C type charger to USB port Adapter) 


Use Case : 

Lets say we have a request in XML format 
But our client to do analytics operation needs it in JSON format 

For which we need a Adaptor 

          (transferred)                             (extended by ) 
Request ------------------>  Adapter ( Interface ) --------------->  XMLtoJsonAdaptor   ( this is our Adaptor) 


Adaptee ( this is the client JSONAnalyticsTool ) which will analyze the data 




class JsonAnalyticsTool  {

  private String jsonData ;

  public JsonAnalyticsTool(String jsonData) { 
      this.jsonData = jsonDatal
  }
  
  public void analyzeData() { 
    // some impl with jsonData
  }

}


interface Adaptor {
  public void analyzeData(); -----> this method is responsible to call the adaptee and 
}

class XMLtoJsonAdaptor implements Adaptor {
       JsonAnalyticsTool  jsonAnalyticsTool;  ----> the adapter itself has the analytics tool 

       public XMLtoJsonAdaptor(String xmlData) {
             // conversion Logic
             String jsonData = xmlData.json();
             jsonAnalyticsTool = new JsonAnalyticsTool(jsonData);
        }

        @Override  ----> overriden method to call
        public void analyzeData() { 
              jsonAnalyticsTool.analyzeData();
         }

  
  
}


*************** Imp Point : 

In the book gangs of Four , its mentioned that whenever confused whether to use is-a / has-a 
always go for has-a relationship to avoid complexity .


