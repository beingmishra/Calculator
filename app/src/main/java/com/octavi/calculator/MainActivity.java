package com.octavi.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


import com.google.android.gms.common.util.ArrayUtils;

import java.util.Arrays;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {

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

        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content = display.getText().toString();
                display.setText(content+"0");
            }
        });
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content = display.getText().toString();
                display.setText(content+"1");
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content = display.getText().toString();
                display.setText(content+"2");
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content = display.getText().toString();
                display.setText(content+"3");
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content = display.getText().toString();
                display.setText(content+"4");
            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content = display.getText().toString();
                display.setText(content+"5");
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content = display.getText().toString();
                display.setText(content+"6");
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content = display.getText().toString();
                display.setText(content+"7");
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content = display.getText().toString();
                display.setText(content+"8");
            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content = display.getText().toString();
                display.setText(content+"9");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content = display.getText().toString();
                char[] ch = new char[content.length()];
                for (int i = 0; i < content.length(); i++) {
                    ch[i] = content.charAt(i);
                }
                char last = ch[ch.length-1];
                if (last == '.') {
                    display.setText(content + "");
                }else {
                    display.setText(content+".");
                }
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content = display.getText().toString();
                char[] ch = new char[content.length()];
                for (int i = 0; i < content.length(); i++) {
                    ch[i] = content.charAt(i);
                }
                char[] del = Arrays.copyOf(ch, ch.length-1);
                String s = String.valueOf(del);
                display.setText(s);
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content = display.getText().toString();
                char[] ch = new char[content.length()];
                for (int i = 0; i < content.length(); i++) {
                    ch[i] = content.charAt(i);
                }
                char last = ch[ch.length-1];
                if (last == '+'){
                    display.setText(content+"");
                }else if (last == '-'){
                    ch[ch.length-1] = '+';
                    String s = String.valueOf(ch);
                    display.setText(s);
                }else if (last == 'x'){
                    ch[ch.length-1] = '+';
                    String s = String.valueOf(ch);
                    display.setText(s);
                }else if (last == '/'){
                    ch[ch.length-1] = '+';
                    String s = String.valueOf(ch);
                    display.setText(s);
                }else{
                    display.setText(content+"+");
                }

            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content = display.getText().toString();
                char[] ch = new char[content.length()];
                for (int i = 0; i < content.length(); i++) {
                    ch[i] = content.charAt(i);
                }
                char last = ch[ch.length-1];
                if (last == '-'){
                    display.setText(content+"");
                }else if (last == '+'){
                    ch[ch.length-1] = '-';
                    String s = String.valueOf(ch);
                    display.setText(s);
                }else if (last == 'x'){
                    ch[ch.length-1] = '-';
                    String s = String.valueOf(ch);
                    display.setText(s);
                }else if (last == '/'){
                    ch[ch.length-1] = '-';
                    String s = String.valueOf(ch);
                    display.setText(s);
                }else{
                    display.setText(content+"-");
                }

            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content = display.getText().toString();
                char[] ch = new char[content.length()];
                for (int i = 0; i < content.length(); i++) {
                    ch[i] = content.charAt(i);
                }
                char last = ch[ch.length-1];
                if (last == '/'){
                    display.setText(content+"");
                }else if (last == '-'){
                    ch[ch.length-1] = '/';
                    String s = String.valueOf(ch);
                    display.setText(s);
                }else if (last == 'x'){
                    ch[ch.length-1] = '/';
                    String s = String.valueOf(ch);
                    display.setText(s);
                }else if (last == '+'){
                    ch[ch.length-1] = '/';
                    String s = String.valueOf(ch);
                    display.setText(s);
                }else{
                    display.setText(content+"/");
                }

            }
        });
        product.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content = display.getText().toString();
                char[] ch = new char[content.length()];
                for (int i = 0; i < content.length(); i++) {
                    ch[i] = content.charAt(i);
                }
                char last = ch[ch.length-1];
                if (last == 'x'){
                    display.setText(content+"");
                }else if (last == '-'){
                    ch[ch.length-1] = 'x';
                    String s = String.valueOf(ch);
                    display.setText(s);
                }else if (last == '+'){
                    ch[ch.length-1] = 'x';
                    String s = String.valueOf(ch);
                    display.setText(s);
                }else if (last == '/'){
                    ch[ch.length-1] = 'x';
                    String s = String.valueOf(ch);
                    display.setText(s);
                }else{
                    display.setText(content+"x");
                }

            }
        });
        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content = display.getText().toString();
                display.setText(content+"^");
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("");
            }
        });
        eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content = display.getText().toString();
                display.setText(evaluatePostfix(content));
            }
        });




    }

    // Method to evaluate value of a postfix expression
    static int evaluatePostfix(String exp)
    {
        //create a stack
        Stack<Integer> stack=new Stack<>();

        // Scan all characters one by one
        for(int i=0;i<exp.length();i++)
        {
            char c=exp.charAt(i);

            // If the scanned character is an operand (number here),
            // push it to the stack.
            if(Character.isDigit(c))
                stack.push(c - '0');

                //  If the scanned character is an operator, pop two
                // elements from stack apply the operator
            else
            {
                int val1 = stack.pop();
                int val2 = stack.pop();

                switch(c)
                {
                    case '+':
                        stack.push(val2+val1);
                        break;

                    case '-':
                        stack.push(val2- val1);
                        break;

                    case '/':
                        stack.push(val2/val1);
                        break;

                    case '*':
                        stack.push(val2*val1);
                        break;
                }
            }
        }
        return stack.pop();
    }
}