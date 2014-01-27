/*
 * Copyright 2004,2005 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.axis2.sample.jaxws.types;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "Project", namespace = "http//axis2.apache.org/sample/jaxws/types")
public class Project {

    private String name;
    private Employee manager;
    private Employee[] developers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public Employee[] getDevelopers() {
        return developers;
    }

    public void setDevelopers(Employee[] developers) {
        this.developers = developers;
    }

}