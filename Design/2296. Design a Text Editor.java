class TextEditor {

        StringBuilder text;
        int cursor_index;

        public TextEditor() {
            this.text = new StringBuilder();
            this.cursor_index = 0;
        }

        public void addText(String text) {
            if (this.cursor_index == 0) {
                this.text.insert(0, text);
            } else if (this.cursor_index == this.text.length()) {
                this.text.append(text);
            } else {
                this.text.insert(cursor_index, text);
            }
            this.cursor_index += text.length();
        }

        public int deleteText(int k) {
            int cnt = 0;
            while (this.text.length() > 0 && this.cursor_index > 0 && k > 0) {
                this.text.deleteCharAt(this.cursor_index - 1);
                cnt++;
                this.cursor_index--;
                k--;
            }
            return cnt;
        }

         public String cursorLeft(int k) {
            int moves = Math.min(k, this.cursor_index);
            this.cursor_index -= moves;
            return this.text.substring(this.cursor_index - Math.min(10, this.cursor_index), this.cursor_index);
        }

        public String cursorRight(int k) {
             int len=this.text.length()-this.cursor_index;
            int moves = Math.min(k, len);
            this.cursor_index += moves;
            return this.text.substring(this.cursor_index - Math.min(this.cursor_index, 10), this.cursor_index);
        }
    }