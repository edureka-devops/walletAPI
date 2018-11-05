package com.edureka.wallet.Impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.edureka.wallet.api.WalletService;
import com.edureka.wallet.model.PaymentTransactionDto;
import com.edureka.wallet.model.WalletDto;

@Service
public class WalletServiceImpl implements WalletService {

	private static final Logger logger = LoggerFactory.getLogger(WalletServiceImpl.class);

	@Override
	public WalletDto doTransaction(PaymentTransactionDto transaction) {
		logger.info("Transaction request received = {} ", transaction);
		// Implemented
		return null;
	}

	@Override
	public WalletDto getBalance(String emailId) {
		logger.info("Get Wallet balance request received = {} ", emailId);
		// Implemented
		return null;
	}

}
