package com.beizhi.nocodegenerationplatform.ai.model;

import jdk.jfr.Description;
import lombok.Data;

/**
 * HTML 代码结果
 */

@Description("生成HTML代码文件的结果")
@Data
public class HtmlCodeResult {

    @Description("生成的HTML代码")
    private String htmlCode;

    @Description("生成的HTML代码的描述")
    private String description;
}
