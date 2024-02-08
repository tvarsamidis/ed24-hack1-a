package gr.codehub.hackathon.model;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@SuperBuilder

public class Activity  {
    private long authorId;

    private long contentId;

    private BigDecimal fee;

}
