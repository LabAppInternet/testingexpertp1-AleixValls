package cat.tecnocampus.fgcstations;

import cat.tecnocampus.fgcstations.application.DTOs.FriendsDTO;
import cat.tecnocampus.fgcstations.application.DTOs.FavoriteJourneyDTO;
import cat.tecnocampus.fgcstations.application.DTOs.DayTimeStartDTO;
import cat.tecnocampus.fgcstations.application.exception.UserDoesNotExistsException;
import cat.tecnocampus.fgcstations.application.exception.FriendAlreadyExistsException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;


import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FgCstationsApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    @Order(1)
    void correctUserNameInFriends() throws Exception {

    }

    @Test
    @Order(2)
    void correctOriginAndDestinationInFavouriteJourney() throws Exception {

    }

    @Test
    Order(3)
    void userNotFoundError() throws Exception {
        mockMvc.perform(get("/users/aleix")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound());
    }
}
