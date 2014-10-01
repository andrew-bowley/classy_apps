/**
    Copyright (C) 2014  www.cybersearch2.com.au

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/> */
package au.com.cybersearch2.classyfy.data;

import au.com.cybersearch2.classynode.Node;
import au.com.cybersearch2.classynode.NodeType;

/**
 * FilePlanNodeType
 * @author Andrew Bowley
 * 05/09/2014
 */
public class FilePlanNodeType implements NodeType<Model>
{
    protected Model model;
    
    /**
     * @param nodeEntity
     * @param parent
     */
    public FilePlanNodeType(Node node)
    {
        this.model = valueOf(node.getModel());
    }


    @Override
    public Model root() {
        return Model.root;
    }

    @Override
    public Model valueOf(String name) 
    {
        return Model.valueOf(name);
    }

    @Override
    public Model valueOf(int ordinal) 
    {
        return Model.values()[ordinal];
    }

    public Model getModel() 
    {
        return model;
    }

}
