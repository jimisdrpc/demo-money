package com.tolearn.endpoint

import javax.inject.Singleton


@Singleton
class DemoMoneyController : DemoMoneyServiceGrpcKt.DemoMoneyServiceCoroutineImplBase() {

    override suspend fun send(request: DemoMoneyRequest): DemoMoneyReply {
        return super.send(request)
    }
}