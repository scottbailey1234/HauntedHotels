/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedHotels.model;

import java.util.Objects;

/**
 *
 * @author Acer
 */
public class Challenge implements Serializable{
    
    //class instance variables
    private String challengeName;
    private String challengeType;
    private String challengeProblem;
    private String challengeSolution;

    public Challenge() {
    }
    

    public String getChallengeName() {
        return challengeName;
    }

    public void setChallengeName(String challengeName) {
        this.challengeName = challengeName;
    }

    public String getChallengeType() {
        return challengeType;
    }

    public void setChallengeType(String challengeType) {
        this.challengeType = challengeType;
    }

    public String getChallengeProblem() {
        return challengeProblem;
    }

    public void setChallengeProblem(String challengeProblem) {
        this.challengeProblem = challengeProblem;
    }

    public String getChallengeSolution() {
        return challengeSolution;
    }

    public void setChallengeSolution(String challengeSolution) {
        this.challengeSolution = challengeSolution;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.challengeName);
        hash = 89 * hash + Objects.hashCode(this.challengeType);
        hash = 89 * hash + Objects.hashCode(this.challengeProblem);
        hash = 89 * hash + Objects.hashCode(this.challengeSolution);
        return hash;
    }

    @Override
    public String toString() {
        return "Challenge{" + "challengeName=" + challengeName + ", challengeType=" + challengeType + ", challengeProblem=" + challengeProblem + ", challengeSolution=" + challengeSolution + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Challenge other = (Challenge) obj;
        if (!Objects.equals(this.challengeName, other.challengeName)) {
            return false;
        }
        if (!Objects.equals(this.challengeType, other.challengeType)) {
            return false;
        }
        if (!Objects.equals(this.challengeProblem, other.challengeProblem)) {
            return false;
        }
        if (!Objects.equals(this.challengeSolution, other.challengeSolution)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
