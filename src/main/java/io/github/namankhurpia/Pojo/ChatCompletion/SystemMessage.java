package io.github.namankhurpia.Pojo.ChatCompletion;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

/**
 * This class can be used to encapsulate System Messages and User Message and Function Message (deprecated)
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SystemMessage {

    @NonNull
    @JsonProperty("role")
    public String role;


    @NonNull
    @JsonProperty("content")
    public String content;

//    @JsonProperty("name")
//    public String name;

    @NonNull
    @JsonProperty("tool_calls")
    public List<ToolCalls> tool_calls;
}
