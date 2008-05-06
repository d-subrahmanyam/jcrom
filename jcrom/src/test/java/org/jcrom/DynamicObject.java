package org.jcrom;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jcrom.annotations.JcrChildNode;
import org.jcrom.annotations.JcrReference;

/**
 *
 * @author Olafur Gauti Gudmundsson
 */
public class DynamicObject extends AbstractJcrEntity {

    @JcrChildNode(lazy=true) Map<String,Object> singleValueChildren;
    @JcrChildNode(lazy=true) Map<String,List<Object>> multiValueChildren;
    
    @JcrReference(lazy=true, byPath=true) Map<String,Object> singleReferences;
    @JcrReference(lazy=true) Map<String,List<Object>> multiReferences;
    
    public DynamicObject() {
        this.singleValueChildren = new HashMap<String,Object>();
        this.multiValueChildren = new HashMap<String,List<Object>>();
        this.singleReferences = new HashMap<String,Object>();
        this.multiReferences = new HashMap<String,List<Object>>();
    }

    public Map<String, List<Object>> getMultiValueChildren() {
        return multiValueChildren;
    }

    public void setMultiValueChildren(Map<String, List<Object>> multiValueChildren) {
        this.multiValueChildren = multiValueChildren;
    }
    
    public void putMultiValueChild( String key, List<Object> values ) {
        multiValueChildren.put(key, values);
    }

    public Map<String, Object> getSingleValueChildren() {
        return singleValueChildren;
    }

    public void setSingleValueChildren(Map<String, Object> singleValueChildren) {
        this.singleValueChildren = singleValueChildren;
    }
    
    public void putSingleValueChild( String key, Object value ) {
        singleValueChildren.put(key, value);
    }

    public Map<String, List<Object>> getMultiReferences() {
        return multiReferences;
    }

    public void setMultiReferences(Map<String, List<Object>> multiReferences) {
        this.multiReferences = multiReferences;
    }
    
    public void putMultiReference( String key, List<Object> values ) {
        multiReferences.put(key, values);
    }

    public Map<String, Object> getSingleReferences() {
        return singleReferences;
    }

    public void setSingleReferences(Map<String, Object> singleReferences) {
        this.singleReferences = singleReferences;
    }
    
    public void putSingleReference( String key, Object value ) {
        singleReferences.put(key, value);
    }
    
    
}