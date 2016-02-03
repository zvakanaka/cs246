/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scripturejournalapp;

/**
 *
 * @author adam
 */
public class Topic {

    private String topic;
    private String subTopic;
    
    public Topic() {

    }

    public Topic(String subt) {
        if (isTopic(subt)) {
          this.subTopic = subt;
          //find and set topic name
          this.topic = Index.getIndex().getTopicTitle(subt);
        }
        else
        {
            System.err.println("ERROR: Bad topic");
        }
    }
    
    @Override
    public String toString() {
        return this.topic;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Topic other = (Topic) obj;
        if ((this.subTopic == null) ? (other.subTopic != null) : !this.subTopic.equals(other.subTopic)) {
            return false;
        }
        if ((this.topic == null) ? (other.topic != null) : !this.topic.equals(other.topic)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (this.subTopic != null ? this.subTopic.hashCode() : 0);
        hash = 53 * hash + (this.topic != null ? this.topic.hashCode() : 0);
        return hash;
    }

    public Boolean isTopic(String t) {
        return Index.getIndex().isTopic(t);
    }

    public void add(String topicName) {
        this.topic = topicName;
    }

    public void setTopic(String topicName) {
        this.topic = topicName;
    }

    public String getTopic() {
        return this.topic;
    }
     
    public String getSubTopic() {
        return this.subTopic;
    }
}
