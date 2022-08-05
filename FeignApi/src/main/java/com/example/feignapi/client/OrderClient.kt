package com.example.feignapi.client

import org.springframework.cloud.openfeign.FeignClient

@FeignClient("order-service")
interface OrderClient {
}