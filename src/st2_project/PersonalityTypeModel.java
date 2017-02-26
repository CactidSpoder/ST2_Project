package st2_project;

import java.util.HashMap;

/**
 *
 * @author Paolo Merle, Corina Obrero
 */

public class PersonalityTypeModel {
    
    private final HashMap<String, PersonalityType> personalityMap;
    
    public PersonalityTypeModel() {
    
        personalityMap = new HashMap<>();
        
        personalityMap.put("ISTJ", new PersonalityType("The Duty Fullfiller", 
                "Serious and quiet, interested in security and peaceful living. "
                + "Extremely thorough, responsible, and dependable."
                + "Well-developed powers of concentration. Usually interested "
                + "in supporting and promoting traditions and establishments. "
                + "Well-organized and hard working, they work steadily towards "
                + "identified goals. They can usually accomplish any task once "
                + "they have set their mind to it."));
        
        personalityMap.put("ISTP", new PersonalityType("The Mechanic", 
                "Quiet and reserved, interested in how and why things work. "
                + "Excellent skills with mechanical things. Risk-takers who "
                + "they live for the moment. Usually interested in and talented "
                + "at extreme sports. Uncomplicated in their desires. Loyal to "
                + "their peers and to their internal value systems, but not "
                + "overly concerned with respecting laws and rules if they get "
                + "in the way of getting something done. Detached and analytical, "
                + "they excel at finding solutions to practical problems."));
        
        personalityMap.put("ISFJ", new PersonalityType("The Nurturer", 
                "Quiet, kind, and conscientious. Can be depended on to follow "
                + "through. Usually puts the needs of others above their own "
                + "needs. Stable and practical, they value security and "
                + "traditions. Well-developed sense of space and function. "
                + "Rich inner world of observations about people. Extremely "
                + "perceptive of other's feelings. Interested in serving others."));
        
        personalityMap.put("ISFP", new PersonalityType("The Artist", 
                "Quiet, serious, sensitive and kind. Do not like conflict, and "
                + "not likely to do things which may generate conflict. Loyal "
                + "and faithful. Extremely well-developed senses, and aesthetic "
                + "appreciation for beauty. Not interested in leading or "
                + "controlling others. Flexible and open-minded. Likely to be "
                + "original and creative. Enjoy the present moment."));
        
        personalityMap.put("INFJ", new PersonalityType("The Protector", 
                "Quietly forceful, original, and sensitive. Tend to stick to "
                + "things until they are done. Extremely intuitive about people, "
                + "and concerned for their feelings. Well-developed value "
                + "systems which they strictly adhere to. Well-respected for "
                + "their perserverence in doing the right thing. Likely to be "
                + "individualistic, rather than leading or following."));
        
        personalityMap.put("INFP", new PersonalityType("The Idealist", 
                "Quiet, reflective, and idealistic. Interested in serving "
                + "humanity. Well-developed value system, which they strive to "
                + "live in accordance with. Extremely loyal. Adaptable and "
                + "laid-back unless a strongly-held value is threatened. Usually"
                + " talented writers. Mentally quick, and able to see "
                + "possibilities. Interested in understanding and helping "
                + "people."));
        
        personalityMap.put("INTJ", new PersonalityType("The Scientist", 
                "Independent, original, analytical, and determined. Have an "
                + "exceptional ability to turn theories into solid plans of "
                + "action. Highly value knowledge, competence, and structure. "
                + "Driven to derive meaning from their visions. Long-range "
                + "thinkers. Have very high standards for their performance, and"
                + " the performance of others. Natural leaders, but will follow "
                + "if they trust existing leaders."));
        
        personalityMap.put("INTP", new PersonalityType("The Thinker", 
                "Logical, original, creative thinkers. Can become very excited "
                + "about theories and ideas. Exceptionally capable and driven to"
                + " turn theories into clear understandings. Highly value "
                + "knowledge, competence and logic. Quiet and reserved, hard "
                + "to get to know well. Individualistic, having no interest in "
                + "leading or following others."));
        
        personalityMap.put("ESTP", new PersonalityType("The Doer", 
                "Friendly, adaptable, action-oriented. \"Doers\" who are focused"
                + " on immediate results. Living in the here-and-now, they're "
                + "risk-takers who live fast-paced lifestyles. Impatient with "
                + "long explanations. Extremely loyal to their peers, but not "
                + "usually respectful of laws and rules if they get in the way "
                + "of getting things done. Great people skills."));
        
        personalityMap.put("ESTJ", new PersonalityType("The Guardian", 
                "Practical, traditional, and organized. Likely to be athletic. "
                + "Not interested in theory or abstraction unless they see the "
                + "practical application. Have clear visions of the way things "
                + "should be. Loyal and hard-working. Like to be in charge. "
                + "Exceptionally capable in organizing and running activities. "
                + "\"Good citizens\" who value security and peaceful living."));
        
        personalityMap.put("ESFP", new PersonalityType("The Performer", 
                "People-oriented and fun-loving, they make things more fun for "
                + "others by their enjoyment. Living for the moment, they love "
                + "new experiences. They dislike theory and impersonal analysis."
                + " Interested in serving others. Likely to be the center of "
                + "attention in social situations. Well-developed common sense "
                + "and practical ability."));
        
        personalityMap.put("ESFJ", new PersonalityType("The Caregiver", 
                "Warm-hearted, popular, and conscientious. Tend to put the needs"
                + " of others over their own needs. Feel strong sense of "
                + "responsibility and duty. Value traditions and security. "
                + "Interested in serving others. Need positive reinforcement to "
                + "feel good about themselves. Well-developed sense of space "
                + "and function."));
        
        personalityMap.put("ENFP", new PersonalityType("The Inspirer", 
                "Enthusiastic, idealistic, and creative. Able to do almost "
                + "anything that interests them. Great people skills. Need to "
                + "live life in accordance with their inner values. Excited by "
                + "new ideas, but bored with details. Open-minded and flexible, "
                + "with a broad range of interests and abilities."));
        
        personalityMap.put("ENFJ", new PersonalityType("The Giver", 
                "Popular and sensitive, with outstanding people skills. "
                + "Externally focused, with real concern for how others think "
                + "and feel. Usually dislike being alone. They see everything "
                + "from the human angle, and dislike impersonal analysis. Very "
                + "effective at managing people issues, and leading group "
                + "discussions. Interested in serving others, and probably place"
                + " the needs of others over their own needs."));
        
        personalityMap.put("ENTP", new PersonalityType("The Visionary", 
                "Creative, resourceful, and intellectually quick. Good at a "
                + "broad range of things. Enjoy debating issues, and may be into"
                + " \"one-up-manship\". They get very excited about new ideas "
                + "and projects, but may neglect the more routine aspects of "
                + "life. Generally outspoken and assertive. They enjoy people "
                + "and are stimulating company. Excellent ability to understand "
                + "concepts and apply logic to find solutions."));
        
        personalityMap.put("ENTJ", new PersonalityType("The Executive", 
                "Assertive and outspoken - they are driven to lead. Excellent "
                + "ability to understand difficult organizational problems and "
                + "create solid solutions. Intelligent and well-informed, they "
                + "usually excel at public speaking. They value knowledge and "
                + "competence, and usually have little patience with "
                + "inefficiency or disorganization."));
    }
    
    public PersonalityType getType(String acronym){
        
        return personalityMap.get(acronym);
    }
}
