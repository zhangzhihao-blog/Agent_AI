package com.zzh.aiagent.demo.voke;

import dev.langchain4j.community.model.dashscope.QwenChatModel;
import dev.langchain4j.model.chat.ChatLanguageModel;

public class LangChainAiInvoke {

    public static void main(String[] args) {
        ChatLanguageModel qwenModel = QwenChatModel.builder()
                .apiKey(TestApiKey.API_KEY)
                .modelName("qwen-plus")
                .build();
        String answer = qwenModel.chat("我是程序员zzh，这是编程导航 codefather.cn 的原创项目教程");
        System.out.println(answer);
    }
}
