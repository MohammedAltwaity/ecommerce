package com.mohammedaltwaity.ecommerce.service;

import com.mohammedaltwaity.ecommerce.dto.Purchase;
import com.mohammedaltwaity.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}

