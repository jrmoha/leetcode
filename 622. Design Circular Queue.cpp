class MyCircularQueue
{
    std::vector<int> queue;
    int front,rear,num_of_elements;
public:
    MyCircularQueue(int k)
    {
        queue.resize(k);
        this->front=0;
        this->rear=0;
        this->num_of_elements=0;
    }

    bool enQueue(int value)
    {
        if (!this->isFull())
        {
            this->queue[rear] = value;
            this->num_of_elements++;
            this->rear = (this->rear + 1) % this->queue.size();
            return true;
        }
        return false;
    }

    bool deQueue()
    {
        if (this->num_of_elements > 0)
        {
            this->num_of_elements--;
            this->front = (this->front + 1) % this->queue.size();
            return true;
        }
        return false;
    }

    int Front()
    {
        if (!this->isEmpty())
        {
            return this->queue  [this->front];
        }
        return -1;
    }

    int Rear()
    {
        if (!this->isEmpty())
        {
            return this->queue[(this->rear + this->queue.size() - 1) % this->queue.size()];
        }
        return -1;
    }

    bool isEmpty()
    {
        return this->num_of_elements == 0;
    }

    bool isFull()
    {
        return this->num_of_elements == this->queue.size();
    }
};

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue* obj = new MyCircularQueue(k);
 * bool param_1 = obj->enQueue(value);
 * bool param_2 = obj->deQueue();
 * int param_3 = obj->Front();
 * int param_4 = obj->Rear();
 * bool param_5 = obj->isEmpty();
 * bool param_6 = obj->isFull();
 */