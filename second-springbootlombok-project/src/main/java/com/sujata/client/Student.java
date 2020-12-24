package com.sujata.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //@Setter + @Getter + @ToString + @EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	private int rollNo;
	private String name;
	
}
