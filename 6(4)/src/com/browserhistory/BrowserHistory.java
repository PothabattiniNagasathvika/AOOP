package com.browserhistory;

	import java.util.ArrayDeque;
	import java.util.Deque;
	import java.util.Scanner;

	public class BrowserHistory {
	    private Deque<String> backStack = new ArrayDeque<>();
	    private Deque<String> forwardStack = new ArrayDeque<>();
	    private String currentPage = null;
	    private Scanner scanner = new Scanner(System.in);

	    // Add a new page to the history
	    public void visitPage(String url) {
	        if (currentPage != null) {
	            backStack.push(currentPage);
	        }
	        currentPage = url;
	        forwardStack.clear(); // Clear the forward history
	        System.out.println("Visited: " + url);
	    }

	    // Go back to the previous page
	    public void goBack() {
	        if (backStack.isEmpty()) {
	            System.out.println("No more pages to go back.");
	            return;
	        }
	        forwardStack.push(currentPage);
	        currentPage = backStack.pop();
	        System.out.println("Went back to: " + currentPage);
	    }

	    // Go forward to the next page
	    public void goForward() {
	        if (forwardStack.isEmpty()) {
	            System.out.println("No more pages to go forward.");
	            return;
	        }
	        backStack.push(currentPage);
	        currentPage = forwardStack.pop();
	        System.out.println("Went forward to: " + currentPage);
	    }

	    // Display the current page
	    public void displayCurrentPage() {
	        if (currentPage == null) {
	            System.out.println("No current page.");
	        } else {
	            System.out.println("Current page: " + currentPage);
	        }
	    }

	    // Menu to manage browser history
	    public void showMenu() {
	        while (true) {
	            System.out.println("\nBrowser History Menu:");
	            System.out.println("1. Visit New Page");
	            System.out.println("2. Go Back");
	            System.out.println("3. Go Forward");
	            System.out.println("4. Display Current Page");
	            System.out.println("5. Exit");
	            System.out.print("Choose an option: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter URL to visit: ");
	                    String url = scanner.nextLine();
	                    visitPage(url);
	                    break;
	                case 2:
	                    goBack();
	                    break;
	                case 3:
	                    goForward();
	                    break;
	                case 4:
	                    displayCurrentPage();
	                    break;
	                case 5:
	                    System.out.println("Exiting Browser History. Goodbye!");
	                    return;
	                default:
	                    System.out.println("Invalid option. Please try again.");
	            }
	        }
	    }

	    public static void main(String[] args) {
	        BrowserHistory browserHistory = new BrowserHistory();
	        browserHistory.showMenu();
	    }
	}


}
