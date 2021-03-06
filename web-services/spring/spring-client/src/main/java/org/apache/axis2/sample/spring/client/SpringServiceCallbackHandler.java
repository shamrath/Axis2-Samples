
/**
 * SpringServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6-wso2v1  Built on : Sep 30, 2010 (09:30:50 IST)
 */

    package org.apache.axis2.sample.spring.client;

    /**
     *  SpringServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class SpringServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public SpringServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public SpringServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for echoString method
            * override this method for handling normal response from echoString operation
            */
           public void receiveResultechoString(
                    String result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from echoString operation
           */
            public void receiveErrorechoString(Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getProject method
            * override this method for handling normal response from getProject operation
            */
           public void receiveResultgetProject(
                    org.apache.axis2.sample.spring.types.Project result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getProject operation
           */
            public void receiveErrorgetProject(Exception e) {
            }
                
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for echoProject method
            * override this method for handling normal response from echoProject operation
            */
           public void receiveResultechoProject(
                    org.apache.axis2.sample.spring.types.Project result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from echoProject operation
           */
            public void receiveErrorechoProject(Exception e) {
            }
                


    }
    