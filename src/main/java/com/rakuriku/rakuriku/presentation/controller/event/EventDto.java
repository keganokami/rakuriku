package com.rakuriku.rakuriku.presentation.controller.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventDto {
	private String eventId;
	private String eventName;
	private String eventCategory;
}
