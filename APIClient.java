package assignment.day6;

public class APIClient {
		    // First overloaded method: accepts only endpoint
		    public void sendRequest(String endpoint) {
		        System.out.println("Sending request to endpoint: " + endpoint);
		    }

		    // Second overloaded method: accepts endpoint, requestBody, and requestStatus
		    public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		        System.out.println("Sending request to endpoint: " + endpoint);
		        System.out.println("Request body: " + requestBody);
		        if (requestStatus==true)
		        {
			        System.out.println("Request successful: " + requestStatus);

		        }
		        
		        else
		        {
			        System.out.println("Request unsuccessful: " + requestStatus);

		        }
		    }

		    public static void main(String[] args) {
		        // Creating an object of APIClient class
		        APIClient apiClient = new APIClient();
		        
		        // Calling the first overloaded method
		        apiClient.sendRequest("https://api.example.com/data");
		        
		        // Calling the second overloaded method
		        apiClient.sendRequest("https://api.example.com/data", "{ \"key\": \"value\" }", false);
		    }

	}


