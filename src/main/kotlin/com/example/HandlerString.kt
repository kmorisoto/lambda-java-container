package com.example

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler

class HandlerString : RequestHandler<String, String> {
    override fun handleRequest(input: String, context: Context): String {
        context.logger.log("Hello Kotlin $input")
        return "Hello Kotlin"
    }
}
