[![Build Status](https://travis-ci.org/IUNO-TDM/PaymentService.svg?branch=master)](https://travis-ci.org/IUNO-TDM/PaymentService)

# PaymentService
Service with restful interface, that handles payments.

## Overview
This server was generated by the [swagger-codegen](https://github.com/swagger-api/swagger-codegen) project. By using the 
[OpenAPI-Spec](https://github.com/swagger-api/swagger-core/wiki) from a remote server, you can easily generate a server stub.  This
is an example of building a swagger-enabled JAX-RS server.

This example uses the [JAX-RS](https://jax-rs-spec.java.net/) framework.

To run the server, please execute the following:

```
mvn clean package jetty:run
```

You can then view the swagger listing here:

```
http://localhost:8080/v1/swagger.json
```

Note that if you have configured the `host` to be something other than localhost, the calls through
swagger-ui will be directed to that host and not localhost!


To create a wallet from a given seed use the parameter ```walletSeed``` on the first run of Payment Service:
```
mvn jetty:run -DwalletSeed=never,drop,fragile,orange,artwork,picture,off,balcony,over,seven,potato,people
```


if wallet contains twice the amount if the required minimum cash liquidity, spare money is sent to the savings address
```
mvn jetty:run -DsavingsAddress=mgSgVGAaz7H99vLB4gAqH3f7Qr1jpcLoy2 -DminimumCash=100000000
```

works around delays due to tx floods by using the ouputs of an incoming payment transaction for an invoice
as inputs for te invoices transfer transaction
while allowing malleability to break the transfer transaction

default is ```true```; set to ```false``` to prevent malleability breaking transfer payments
```
mvn jetty:run -DuseIncomingPaymentForTransfers=true
```