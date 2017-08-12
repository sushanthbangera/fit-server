
package com.fit.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fit.constants.CFMEMessageConstants;

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
                return CFMEMessageConstants.SAVED_SUCCESSFULLY;
            case 2:
                return CFMEMessageConstants.UPDATED_SUCCESSFULLY;
            case 3:
                return CFMEMessageConstants.DELETED_SUCCESSFULLY;
            case 4:
                return CFMEMessageConstants.ERROR_OCCURED;
            default:
                return CFMEMessageConstants.UNKNOWN_ERROR;
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
