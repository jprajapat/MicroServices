package com.user_service.requestdto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequestDto {
	
	private Integer userId;
	private String name;
	private String phone;
	private Integer contactId;

}
