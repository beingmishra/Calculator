package com.octavi.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.HapticFeedbackConstants;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import java.util.Arrays;

import com.github.ayaanqui.expressionresolver.Resolver;

public class MainActivity extends AppCompatActivity {

    boolean flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button num0 = findViewById(R.id.num_0);
        Button num1 = findViewById(R.id.num_1);
        Button num2 = findViewById(R.id.num_2);
        Button num3 = findViewById(R.id.num_3);
        Button num4 = findViewById(R.id.num_4);
        Button num5 = findViewById(R.id.num_5);
        Button num6 = findViewById(R.id.num_6);
        Button num7 = findViewById(R.id.num_7);
        Button num8 = findViewById(R.id.num_8);
        Button num9 = findViewById(R.id.num_9);
        Button dot = findViewById(R.id.dot);
        ImageButton delete = findViewById(R.id.delete);
        Button add = findViewById(R.id.plus);
        Button minus = findViewById(R.id.minus);
        Button division = findViewById(R.id.div);
        Button product = findViewById(R.id.product);
        Button power = findViewById(R.id.power);
        Button clear = findViewById(R.id.clear);
        Button eq = findViewById(R.id.equals);
        TextView display = findViewById(R.id.display);
        TextView formulae = findViewById(R.id.formulae);

        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num0.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
                if (flag == true){
                    formulae.setText("");
                    display.setText("0");
                    flag = false;
                }else {
                    String content = display.getText().toString();
                    display.setText(content+"0");
                }
            }
        });
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
                if (flag == true){
                    formulae.setText("");
                    display.setText("1");
                    flag = false;
                }else {
                    String content = display.getText().toString();
                    display.setText(content+"1");
                }
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
                if (flag == true){
                    formulae.setText("");
                    display.setText("2");
                    flag = false;
                }else {
                    String content = display.getText().toString();
                    display.setText(content+"2");
                }
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num3.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
                if (flag == true){
                    formulae.setText("");
                    display.setText("3");
                    flag = false;
                }else {
                    String content = display.getText().toString();
                    display.setText(content+"3");
                }
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num4.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
                if (flag == true){
                    formulae.setText("");
                    display.setText("4");
                    flag = false;
                }else {
                    String content = display.getText().toString();
                    display.setText(content+"4");
                }
            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num5.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
                if (flag == true){
                    formulae.setText("");
                    display.setText("5");
                    flag = false;
                }else {
                    String content = display.getText().toString();
                    display.setText(content+"5");
                }
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num6.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
                if (flag == true){
                    formulae.setText("");
                    display.setText("6");
                    flag = false;
                }else {
                    String content = display.getText().toString();
                    display.setText(content+"6");
                }
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num7.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
                if (flag == true){
                    formulae.setText("");
                    display.setText("7");
                    flag = false;
                }else {
                    String content = display.getText().toString();
                    display.setText(content+"7");
                }
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num8.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
                if (flag == true){
                    formulae.setText("");
                    display.setText("8");
                    flag = false;
                }else {
                    String content = display.getText().toString();
                    display.setText(content+"8");
                }
            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num9.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
                if (flag == true){
                    formulae.setText("");
                    display.setText("9");
                    flag = false;
                }else {
                    String content = display.getText().toString();
                    display.setText(content+"9");
                }
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dot.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
                String content = display.getText().toString();
                if (content==""){
                    display.setText("");
                } else {
                    char[] ch = new char[content.length()];
                    for (int i = 0; i < content.length(); i++) {
                        ch[i] = content.charAt(i);
                    }
                    char last = ch[ch.length - 1];
                    if (last == '.') {
                        display.setText(content + "");
                    } else {
                        display.setText(content + ".");
                    }
                }
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delete.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
                String content = display.getText().toString();
                if (content==""){
                    display.setText("");
                } else{
                    char[] ch = new char[content.length()];
                    for (int i = 0; i < content.length(); i++) {
                        ch[i] = content.charAt(i);
                    }
                    char[] del = Arrays.copyOf(ch, ch.length-1);
                    String s = String.valueOf(del);
                    display.setText(s);
                }
            }
        });
        delete.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                display.setText("");
                formulae.setText("");
                formulae.setVisibility(View.INVISIBLE);
                return true;
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
                String content = display.getText().toString();
                if (content==""){
                    display.setText("");
                } else {
                    char[] ch = new char[content.length()];
                    for (int i = 0; i < content.length(); i++) {
                        ch[i] = content.charAt(i);
                    }
                    char last = ch[ch.length - 1];
                    if (last == '+') {
                        display.setText(content + "");
                    } else if (last == '-') {
                        ch[ch.length - 1] = '+';
                        String s = String.valueOf(ch);
                        display.setText(s);
                    } else if (last == 'x') {
                        ch[ch.length - 1] = '+';
                        String s = String.valueOf(ch);
                        display.setText(s);
                    } else if (last == '/') {
                        ch[ch.length - 1] = '+';
                        String s = String.valueOf(ch);
                        display.setText(s);
                    } else {
                        display.setText(content + "+");
                    }
                }
                flag = false;
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                minus.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
                String content = display.getText().toString();
                if (content==""){
                    display.setText("");
                } else {
                    char[] ch = new char[content.length()];
                    for (int i = 0; i < content.length(); i++) {
                        ch[i] = content.charAt(i);
                    }
                    char last = ch[ch.length - 1];
                    if (last == '-') {
                        display.setText(content + "");
                    } else if (last == '+') {
                        ch[ch.length - 1] = '-';
                        String s = String.valueOf(ch);
                        display.setText(s);
                    } else if (last == 'x') {
                        ch[ch.length - 1] = '-';
                        String s = String.valueOf(ch);
                        display.setText(s);
                    } else if (last == '/') {
                        ch[ch.length - 1] = '-';
                        String s = String.valueOf(ch);
                        display.setText(s);
                    } else {
                        display.setText(content + "-");
                    }
                }
                flag = false;
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                division.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
                String content = display.getText().toString();
                if (content==""){
                    display.setText("");
                } else {
                    char[] ch = new char[content.length()];
                    for (int i = 0; i < content.length(); i++) {
                        ch[i] = content.charAt(i);
                    }
                    char last = ch[ch.length - 1];
                    if (last == '/') {
                        display.setText(content + "");
                    } else if (last == '-') {
                        ch[ch.length - 1] = '/';
                        String s = String.valueOf(ch);
                        display.setText(s);
                    } else if (last == 'x') {
                        ch[ch.length - 1] = '/';
                        String s = String.valueOf(ch);
                        display.setText(s);
                    } else if (last == '+') {
                        ch[ch.length - 1] = '/';
                        String s = String.valueOf(ch);
                        display.setText(s);
                    } else {
                        display.setText(content + "/");
                    }
                }
                flag = false;
            }
        });
        product.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
                String content = display.getText().toString();
                if (content==""){
                    display.setText("");
                } else {
                    char[] ch = new char[content.length()];
                    for (int i = 0; i < content.length(); i++) {
                        ch[i] = content.charAt(i);
                    }
                    char last = ch[ch.length - 1];
                    if (last == '*') {
                        display.setText(content + "");
                    } else if (last == '-') {
                        ch[ch.length - 1] = '*';
                        String s = String.valueOf(ch);
                        display.setText(s);
                    } else if (last == '+') {
                        ch[ch.length - 1] = '*';
                        String s = String.valueOf(ch);
                        display.setText(s);
                    } else if (last == '/') {
                        ch[ch.length - 1] = '*';
                        String s = String.valueOf(ch);
                        display.setText(s);
                    } else {
                        display.setText(content + "*");
                    }
                }
                flag = false;
            }
        });
        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                power.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
                String content = display.getText().toString();
                if (content==""){
                    display.setText("");
                } else {
                    char[] ch = new char[content.length()];
                    char last = ch[ch.length-1];
                    if (last == '^') {
                        display.setText(content + "");
                    }else {
                        display.setText(content+"^");
                    }
                }
                flag = false;
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
                display.setText("");
                formulae.setText("");
                formulae.setVisibility(View.INVISIBLE);
            }
        });
        eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eq.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
                String content = display.getText().toString();
                if (content==""){
                    display.setText("");
                } else {
                    Resolver calculator = new Resolver();
                    calculator.setExpression(content);
                    double value = calculator.solveExpression().result;
                    String ans = String.valueOf(value);
                    char[] ch = new char[ans.length()];
                    for (int i = 0; i < ans.length(); i++) {
                        ch[i] = ans.charAt(i);
                    }
                    char last = ch[ch.length-1];
                    char slast = ch[ch.length-2];

                    if (content.contains("/0")){
                        formulae.setVisibility(View.VISIBLE);
                        formulae.setText(content);
                        display.setText("Can't divide by 0");
                    }else {
                        if (last == '0' && slast == '.'){
                            int result = (int) value;
                            formulae.setVisibility(View.VISIBLE);
                            formulae.setText(content);
                            if (String.valueOf(result).length() > 9){
                                display.setText(String.valueOf(result).substring(0,10));
                            }else {
                                display.setText(String.valueOf(result));
                            }
                        }else{
                            formulae.setVisibility(View.VISIBLE);
                            formulae.setText(content);
                            display.setText(ans);
                        }
                    }
                    flag = true;
                }
            }
        });
    }

}