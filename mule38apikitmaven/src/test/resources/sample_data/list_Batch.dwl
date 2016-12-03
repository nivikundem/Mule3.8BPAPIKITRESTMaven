%dw 1.0
%output application/java
---
[{
	amount: 1,
	firstName: "????",
	lastName: "????",
	transactionNumber: "????",
	transactionRef: "TR3",
	transactionType: "????"
} as :object {
	class : "com.bpapi.org.Batch"
}]