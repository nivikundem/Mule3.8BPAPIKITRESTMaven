%dw 1.0
%output application/java
---
[{
	amount: 1,
	firstName: "n",
	lastName: "k",
	transactionNumber: "T1",
	transactionRef: "tr1",
	transactionType: "REST"
} as :object {
	class : "com.bpapi.org.Batch"
}, 
{
	amount: 2,
	firstName: "Nivi",
	lastName: "Kundem",
	transactionNumber: "TN2",
	transactionRef: "tr2",
	transactionType: "SOAP"
} as :object {
	class : "com.bpapi.org.Batch"
}

]