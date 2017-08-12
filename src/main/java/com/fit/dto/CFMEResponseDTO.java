
package com.fit.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author Sushanth Bangera
 */
public class CFMEResponseDTO {
 
    private int mResponseCode;
    private String mResponseMessage;
    
    public CFMEResponseDTO(int inResponseCode) {
        this.mResponseCode = inResponseCode;
        this.mResponseMessage = getMessage(inResponseCode);
    }
    
    public static String getMessage(int inCode) {
        switch (inCode) {
            case 1:
                return "Data saved";
            case 2:
                return "Data updated";
            case 3:
                return "Deleted successfuly";
            case 4:
                return "Error occured";
            default:
                return "Unknown error";
        }
    }

    @JsonProperty("rescode")
    public int getmResponseCode() {
        return mResponseCode;
    }

    public void setmResponseCode(int mResponseCode) {
        this.mResponseCode = mResponseCode;
    }

    @JsonProperty("resmsg")
    public String getmResponseMessage() {
        return mResponseMessage;
    }

    public void setmResponseMessage(String mResponseMessage) {
        this.mResponseMessage = mResponseMessage;
    }
}
