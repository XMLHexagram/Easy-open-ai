package io.github.namankhurpia.Pojo.ChatCompletion;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ToolCallsFunction {
    /**
     * name
     * string
     * The name of the function to call.
     */
    @JsonProperty("name")
    String name;

    @JsonProperty("arguments")
    String arguments;
}
