class MyLinkedList
{
public:
    ListNode* head;
    int size;
    MyLinkedList()
    {
        this->head=nullptr;
        this->size=0;
    }

    int get(int index)
    {
        ListNode* cur = this->head;
        int i=0;
        while(cur!=nullptr && i<index)
        {
            cur=cur->next;
            if(cur==nullptr)return -1;
            i++;
        }
        return cur!=nullptr? cur->val:-1;
    }

    void addAtHead(int val)
    {
        ListNode* node=new ListNode(val);
        node->next=this->head;
        this->head=node;
        this->size++;
    }

    void addAtTail(int val)
    {
        ListNode* node=new ListNode(val);
        ListNode* cur=this->head;
        if(this->head==nullptr)
        {
            this->head=node;
        }
        else
        {
            while (cur->next != nullptr)
            {
                cur = cur->next;
            }
            cur->next = node;
        }
        this->size++;
    }

    void addAtIndex(int index, int val)
    {
        if (index == 0)
        {
            this->addAtHead(val);
        }
        else if (index <= this->size)
        {
            ListNode* node = new ListNode(val);
            int i = 0;
            ListNode* cur = this->head;
            while (i < index - 1 && cur->next != nullptr)
            {
                i++;
                cur = cur->next;
            }
            if (cur != nullptr)
            {
                ListNode* n = cur->next;
                cur->next = node;
                node->next = n;
            }
            this->size++;
        }
    }

    void deleteAtIndex(int index)
    {
        if (index == 0 && this->head != nullptr)
        {
            this->head = this->head->next;
        }
        else
        {
            int i = 0;
            ListNode* cur = this->head;
            while (cur->next != nullptr && i < index - 1)
            {
                i++;
                cur = cur->next;
            }
            if (cur->next != nullptr)
            {
                cur->next = cur->next->next;
                this->size--;
            }
        }
    }
    void print_()
    {
        ListNode* cur= this->head;
        while(cur!=nullptr)
        {
            std::cout<<cur->val<<" ";
            cur=cur->next;
        }
        std::cout<<""<<std::endl;
    }
};
