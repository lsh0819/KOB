export class Cell{
    constructor(r, c){
        this.r = r;
        this.c = c;
        this.x = c + 0.5; // 坐标转换
        this.y = r + 0.5;
    }
}