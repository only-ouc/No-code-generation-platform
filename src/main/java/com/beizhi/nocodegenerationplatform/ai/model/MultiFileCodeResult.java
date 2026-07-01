package com.beizhi.nocodegenerationplatform.ai.model;

import jdk.jfr.Description;
import lombok.Data;

/**
 * 多文件代码结果
 */
@Description("生成的多文件代码结果")
@Data
public class MultiFileCodeResult {

    @Description("HTML代码")
    private String htmlCode;

    @Description("CSS代码")
    private String cssCode;

    @Description("JS代码")
    private String jsCode;

    @Description("生成代码的描述")
    private String description;
}
