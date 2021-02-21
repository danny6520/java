package com.example.sms;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.PublishRequest;

public class SMSClass {

	public static void main(String[] args) {
		BasicAWSCredentials awsCreds = new BasicAWSCredentials("YOUR SECRET ID","YOUR SECRET CODE");
		
		AmazonSNS snsClient = AmazonSNSClient
				.builder()
				.withRegion(Regions.AP_SOUTHEAST_2)
				.withCredentials(new AWSStaticCredentialsProvider(awsCreds))
				.build();
		
		String SMSMessage = "Hello..! This message was sent using AWS SNS.";  //Your message
		String mobile = "+91xxxxxxxxxx";  //Your mobile number
		
		snsClient.publish(new PublishRequest().withMessage(SMSMessage).withPhoneNumber(mobile));
	}

}
