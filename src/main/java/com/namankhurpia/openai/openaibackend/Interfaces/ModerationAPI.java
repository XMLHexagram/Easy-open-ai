package com.namankhurpia.openai.openaibackend.Interfaces;
import com.namankhurpia.openai.openaibackend.Pojo.Moderations.ModerationAPIRequest;
import com.namankhurpia.openai.openaibackend.Pojo.Moderations.ModerationAPIResponse;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface ModerationAPI {

    @POST("/v1/moderations")
    ModerationAPIResponse getmoderation(@Header("Authorization")String accessToken, @Body ModerationAPIRequest request);


}
